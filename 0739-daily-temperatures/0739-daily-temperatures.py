class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        n = len(temperatures)
        days_until_warmer = [0] * n
        pending_indices: list[int] = []  # indices of days waiting for a warmer temp

        for current_day, current_temp in enumerate(temperatures):
            # Resolve all earlier cooler days
            while pending_indices and temperatures[pending_indices[-1]] < current_temp:
                previous_day = pending_indices.pop()
                days_until_warmer[previous_day] = current_day - previous_day
            pending_indices.append(current_day)

        return days_until_warmer

            
