#set($symbol_pound='#')
#set($symbol_dollar='$')
#set($symbol_escape='\' )
import os


def deploy():
    os.system("git pull")
    os.system("mvn clean deploy -DskipTests=true -file *-client")


if __name__ == "__main__":
    deploy()
