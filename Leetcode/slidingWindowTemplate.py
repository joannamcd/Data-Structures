
class Solution:
    def lengthOfLongestSubstringTwoDistinct(self, s: str, t: str) -> int:
        #initialize a collection/int value to save result according to the question
        result = []
        if(len(t) > len(s)):
            return result
        
        #create a hashmap to save the characters of the target substring.
        #(K, V) = (Character, Frequence of the Characters)
        map = {}
        for char in range(len(t)):
            map[char] = {t[char] : map.get(char, 0)+1}
    
        #maintain a counter to check whether it is matching the target string
        counter = len(map)
        
        #two pointers: begin/left pointer and end/right pointer
        left, right = 0, 0 
        
        #the length of the substring which matches the target string
        length = 0
        
        #loop at the beginning of the source string
        while(right < len(s)):
            char = s[right]
            
            if(char in map):
                map[char] = map[char]-1 #plus or minus one
                if(map[char] == 0):
                    counter -= 1
            right += 1        
        
            #increase left pointer to make it invalid/valid again
            while(counter == 0): #counter condition, diff question may have diff condition            
                tempChar = s[left]
                if tempChar in map.keys():
                    map[tempChar] = map[tempChar] + 1 #plus or minus one
                    if(map[tempChar] >0):
                        counter += 1 #modify the counter according to the requirement
                        
                #save or update min/max the result if you find a target
                left+=1
 
        return 0 #return whatever should be returned