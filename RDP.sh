#! /bin/bash
printf "Installing... " >&2
sudo useradd -m MAGMA
sudo adduser MAGMA sudo
echo 'MAGMA:123456' | sudo chpasswd
sed -i 's/\/bin\/sh/\/bin\/bash/g' /etc/passwd
sudo apt update
wget https://dl.google.com/linux/direct/chrome-remote-desktop_current_amd64.deb
sudo dpkg -i chrome-remote-desktop_current_amd64.deb
sudo apt install --assume-yes --fix-broken
sudo DEBIAN_FRONTEND=noninteractive \
apt install --assume-yes kubuntu-desktop xfce4 desktop-base
sudo bash -c 'echo "exec /etc/X11/Xsession /usr/bin/xfce4-session" > /etc/chrome-remote-desktop-session'  
sudo apt install --assume-yes xscreensaver
sudo systemctl disable lightdm.service
wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
sudo dpkg -i google-chrome-stable_current_amd64.deb
sudo apt install --assume-yes --fix-broken
sudo apt install nautilus nano -y 
sudo adduser MAGMA chrome-remote-desktop
printf "\nSetup Complete " >&2 ||
printf "\nError Occured " >&2
printf '\nCheck https://remotedesktop.google.com/headless  Copy Command Of Debian Linux And Paste Down\n'
read -p "Paste Here: " CRP
su - MAGMA -c """$CRP"""
printf 'Check https://remotedesktop.google.com/access/ \n\n'
if sudo apt upgrade &> /dev/null
then
    printf "\n\nUpgrade Completed " >&2
else
    printf "\n\nError Occured " >&2
fi
