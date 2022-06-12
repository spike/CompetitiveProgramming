class Solution:
    def strongPasswordCheckerII(self, password: str) -> bool:
        special = False
        numeric = False
        lowercase = False
        uppercase = False
        
        if len(password) < 8:
            return False
        
        for i in range(1, len(password)):
            if password[i] == password[i-1]:
                return False
            
        for l in password:
            if l in "!@#$%^&*()-+":
                special = True
            if 'a' <= l <= 'z':
                lowercase = True
            if 'A' <= l <= 'Z':
                uppercase = True
            if '0' <= l <= '9':
                numeric = True
                
        if special and numeric and lowercase and uppercase:
            return True
        else:
            return False
        
        
        