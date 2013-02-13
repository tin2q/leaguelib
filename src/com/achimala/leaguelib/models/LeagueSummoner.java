/*
 *  This file is part of LeagueLib.
 *  LeagueLib is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  LeagueLib is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with LeagueLib.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.achimala.leaguelib.models;

import com.gvaneyck.rtmp.TypedObject;

public class LeagueSummoner {
    private int _id=-1, _accountId=-1;
    private int _profileIconId=0, _level=0;
    private String _name=null, _internalName=null;
    LeagueSummonerProfileInfo _profileInfo=null;
    LeagueSummonerLeagueStats _leagueStats=null;
    LeagueSummonerRankedStats _rankedStats=null;
    
    public LeagueSummoner() {
        _profileInfo = new LeagueSummonerProfileInfo();
    }
    
    public LeagueSummoner(int id, String name) {
        this();
        _id = id;
        _name = name;
    }
    
    public LeagueSummoner(TypedObject obj) {
        this();
        obj = obj.getTO("body");
        _id = obj.getInt("summonerId");
        _accountId = obj.getInt("acctId");
        _name = obj.getString("name");
        _internalName = obj.getString("internalName");
        _profileIconId = obj.getInt("profileIconId");
        _level = obj.getInt("summonerLevel");
    }
    
    public void setId(int id) {
        _id = id;
    }
    
    public void setAccountId(int id) {
        _accountId = id;
    }
    
    public void setName(String name) {
        _name = name;
    }
    
    public void setInternalName(String name) {
        _internalName = name;
    }
    
    public void setProfileIconId(int id) {
        _profileIconId = id;
    }
    
    public void setLevel(int level) {
        _level = level;
    }
    
    public void setProfileInfo(LeagueSummonerProfileInfo info) {
        _profileInfo = info;
    }
    
    public void setLeagueStats(LeagueSummonerLeagueStats stats) {
        _leagueStats = stats;
    }
    
    public void setRankedStats(LeagueSummonerRankedStats stats) {
        _rankedStats = stats;
    }
    
    public int getId() {
        return _id;
    }
    
    public int getAccountId() {
        return _accountId;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getInternalName() {
        return _internalName;
    }
    
    public int getProfileIconId() {
        return _profileIconId;
    }
    
    public int getLevel() {
        return _level;
    }
    
    public LeagueSummonerProfileInfo getProfileInfo() {
        return _profileInfo;
    }
    
    public LeagueSummonerLeagueStats getLeagueStats() {
        return _leagueStats;
    }
    
    public LeagueSummonerRankedStats getRankedStats() {
        return _rankedStats;
    }
}