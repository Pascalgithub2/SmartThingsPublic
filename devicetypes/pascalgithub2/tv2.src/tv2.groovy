/**
 *  TV2
 *
 *  Copyright 2018 Pascal Rutgers
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
metadata {
	definition (name: "TV2", namespace: "Pascalgithub2", author: "Pascal Rutgers") {
		capability "Audio Mute"
		capability "Audio Notification"
		capability "Audio Stream"
		capability "Audio Volume"
		capability "Media Controller"
		capability "Media Group"
		capability "Media Input Source"
		capability "Media Playback"
		capability "Media Playback Repeat"
		capability "Media Playback Shuffle"
		capability "Media Presets"
		capability "Media Track Control"
		capability "Power"
		capability "Remote Control"
		capability "Switch"
		capability "Tv Channel"
	}


	simulator {
		// TODO: define status and reply messages here
	}

	tiles {
		// TODO: define your main and details tiles here
	}
}

// parse events into attributes
def parse(String description) {
	log.debug "Parsing '${description}'"
	// TODO: handle 'mute' attribute
	// TODO: handle 'uri' attribute
	// TODO: handle 'volume' attribute
	// TODO: handle 'activities' attribute
	// TODO: handle 'currentActivity' attribute
	// TODO: handle 'groupRole' attribute
	// TODO: handle 'groupPrimaryDeviceId' attribute
	// TODO: handle 'groupId' attribute
	// TODO: handle 'inputSource' attribute
	// TODO: handle 'supportedInputSources' attribute
	// TODO: handle 'playbackStatus' attribute
	// TODO: handle 'supportedPlaybackCommands' attribute
	// TODO: handle 'playbackRepeatMode' attribute
	// TODO: handle 'playbackShuffle' attribute
	// TODO: handle 'presets' attribute
	// TODO: handle 'supportedTrackControlCommands' attribute
	// TODO: handle 'powerSource' attribute
	// TODO: handle 'controlGesture' attribute
	// TODO: handle 'switch' attribute
	// TODO: handle 'tvChannel' attribute

}

// handle commands
def setMute() {
	log.debug "Executing 'setMute'"
	// TODO: handle 'setMute' command
}

def mute() {
	log.debug "Executing 'mute'"
	// TODO: handle 'mute' command
}

def unmute() {
	log.debug "Executing 'unmute'"
	// TODO: handle 'unmute' command
}

def playTrack() {
	log.debug "Executing 'playTrack'"
	// TODO: handle 'playTrack' command
}

def playTrackAndResume() {
	log.debug "Executing 'playTrackAndResume'"
	// TODO: handle 'playTrackAndResume' command
}

def playTrackAndRestore() {
	log.debug "Executing 'playTrackAndRestore'"
	// TODO: handle 'playTrackAndRestore' command
}

def startAudio() {
	log.debug "Executing 'startAudio'"
	// TODO: handle 'startAudio' command
}

def stopAudio() {
	log.debug "Executing 'stopAudio'"
	// TODO: handle 'stopAudio' command
}

def setVolume() {
	log.debug "Executing 'setVolume'"
	// TODO: handle 'setVolume' command
}

def volumeUp() {
	log.debug "Executing 'volumeUp'"
	// TODO: handle 'volumeUp' command
}

def volumeDown() {
	log.debug "Executing 'volumeDown'"
	// TODO: handle 'volumeDown' command
}

def startActivity() {
	log.debug "Executing 'startActivity'"
	// TODO: handle 'startActivity' command
}

def setInputSource() {
	log.debug "Executing 'setInputSource'"
	// TODO: handle 'setInputSource' command
}

def setPlaybackStatus() {
	log.debug "Executing 'setPlaybackStatus'"
	// TODO: handle 'setPlaybackStatus' command
}

def play() {
	log.debug "Executing 'play'"
	// TODO: handle 'play' command
}

def pause() {
	log.debug "Executing 'pause'"
	// TODO: handle 'pause' command
}

def stop() {
	log.debug "Executing 'stop'"
	// TODO: handle 'stop' command
}

def fastForward() {
	log.debug "Executing 'fastForward'"
	// TODO: handle 'fastForward' command
}

def rewind() {
	log.debug "Executing 'rewind'"
	// TODO: handle 'rewind' command
}

def setPlaybackRepeatMode() {
	log.debug "Executing 'setPlaybackRepeatMode'"
	// TODO: handle 'setPlaybackRepeatMode' command
}

def setPlaybackShuffle() {
	log.debug "Executing 'setPlaybackShuffle'"
	// TODO: handle 'setPlaybackShuffle' command
}

def playPreset() {
	log.debug "Executing 'playPreset'"
	// TODO: handle 'playPreset' command
}

def nextTrack() {
	log.debug "Executing 'nextTrack'"
	// TODO: handle 'nextTrack' command
}

def previousTrack() {
	log.debug "Executing 'previousTrack'"
	// TODO: handle 'previousTrack' command
}

def on() {
	log.debug "Executing 'on'"
	// TODO: handle 'on' command
}

def off() {
	log.debug "Executing 'off'"
	// TODO: handle 'off' command
}

def setTvChannel() {
	log.debug "Executing 'setTvChannel'"
	// TODO: handle 'setTvChannel' command
}

def channelUp() {
	log.debug "Executing 'channelUp'"
	// TODO: handle 'channelUp' command
}

def channelDown() {
	log.debug "Executing 'channelDown'"
	// TODO: handle 'channelDown' command
}