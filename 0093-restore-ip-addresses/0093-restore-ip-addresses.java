class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ips = new ArrayList();
        int N = s.length();
        for(int i =1; i < N;i++)
        {
        String[] parts = new String[4];
        parts[0] = s.substring(0,i);
            if(!isIPValid(parts[0])) continue; // Skip this iteration
            
            for(int j = i + 1; j < i + Integer.min(N - i,4);j++)
            {
                parts[1] = s.substring(i,j);
                if(!isIPValid(parts[1])) continue; // Skip this iteration
                
                for(int k = j + 1; k < j + Integer.min(N - j,4);k++)
                {
                    parts[2] = s.substring(j,k);
                parts[3] = s.substring(k);
                    if(isIPValid(parts[2]) && isIPValid(parts[3]))
                        ips.add(getFullIpAddress(parts));

                }
            }
        }
        return ips;
        
    }
    
    private boolean isIPValid(String str)
    {
	if (str.length() > 1 && str.charAt(0) == '0')  // Test case is to check pattern like "01"
				return false;
        int strAsInt = getStringAsInt(str);
        if(strAsInt < 0 || strAsInt > 255)
            return false;
        
        return true;
    }
    private Integer getStringAsInt(String str)
    {
        int val = 0;
        for(char c : str.toCharArray())
            val = val * 10 + (c- '0');
        
        return val;
    }
    
    private String getFullIpAddress(String[] parts)
    {
        StringBuilder string = new StringBuilder();
        for(int i =0; i < parts.length - 1; i++)
        {
            String part = parts[i];
            string.append(part).append(".");
        }
        string.append(parts[parts.length - 1]);
        
        return string.toString();
    }
}