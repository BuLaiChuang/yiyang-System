package com.medcare.older.pojo;

public class OlderHealthy {
		private int health_id;
		private int old_id;
		private String health_sz;
		private String health_ss;
		private String health_mb;
		private String health_mb_time;
		private String health_xt;
		private String health_xt_time_cha;
		private String health_xt_time;
		private String health_xy;
		private String health_xy_time;
		
		
		public OlderHealthy() {
			super();
			
		}
		public int getHealth_id() {
			return health_id;
		}
		public void setHealth_id(int health_id) {
			this.health_id = health_id;
		}
		public int getOld_id() {
			return old_id;
		}
		public void setOld_id(int old_id) {
			this.old_id = old_id;
		}
		public String getHealth_sz() {
			return health_sz;
		}
		public void setHealth_sz(String health_sz) {
			this.health_sz = health_sz;
		}
		public String getHealth_ss() {
			return health_ss;
		}
		public void setHealth_ss(String health_ss) {
			this.health_ss = health_ss;
		}
		public String getHealth_mb() {
			return health_mb;
		}
		public void setHealth_mb(String health_mb) {
			this.health_mb = health_mb;
		}
		public String getHealth_mb_time() {
			return health_mb_time;
		}
		public void setHealth_mb_time(String health_mb_time) {
			this.health_mb_time = health_mb_time;
		}
		public String getHealth_xt() {
			return health_xt;
		}
		public void setHealth_xt(String health_xt) {
			this.health_xt = health_xt;
		}
		public String getHealth_xt_time_cha() {
			return health_xt_time_cha;
		}
		public void setHealth_xt_time_cha(String health_xt_time_cha) {
			this.health_xt_time_cha = health_xt_time_cha;
		}
		public String getHealth_xt_time() {
			return health_xt_time;
		}
		public void setHealth_xt_time(String health_xt_time) {
			this.health_xt_time = health_xt_time;
		}
		public String getHealth_xy() {
			return health_xy;
		}
		public void setHealth_xy(String health_xy) {
			this.health_xy = health_xy;
		}
		public String getHealth_xy_time() {
			return health_xy_time;
		}
		public void setHealth_xy_time(String health_xy_time) {
			this.health_xy_time = health_xy_time;
		}
		public OlderHealthy(int health_id, int old_id, String health_sz, String health_ss, String health_mb,
				String health_mb_time, String health_xt, String health_xt_time_cha,String health_xt_time, String health_xy, String health_xy_time) {
			super();
			this.health_id = health_id;
			this.old_id = old_id;
			this.health_sz = health_sz;
			this.health_ss = health_ss;
			this.health_mb = health_mb;
			this.health_mb_time=health_xt_time; 
			this.health_xt = health_xt;
			this.health_xt_time_cha=health_xt_time_cha;
			this.health_xt_time = health_xt_time;
			this.health_xy = health_xy;
			this.health_xy_time = health_xy_time;
		}
		@Override
		public String toString() {
			return "OlderHealthy [health_id=" + health_id + ", old_id=" + old_id + ", health_sz=" + health_sz
					+ ", health_ss=" + health_ss + ", health_mb=" + health_mb + ", health_xt=" + health_xt
					+ ", health_xt_time=" + health_xt_time + ", health_xy=" + health_xy + ", health_xy_time="
					+ health_xy_time + "]";
		}
		
}
