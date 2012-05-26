package com.roddet.gatling
import com.excilys.ebi.gatling.core.Predef._
import com.excilys.ebi.gatling.http.Predef._
import com.excilys.ebi.gatling.jdbc.Predef._

class SimulationGoogleJCertif extends Simulation {

	def apply = {
		val urlBase = "http://safebrowsing-cache.google.com"

		val httpConf = httpConfig
						.baseURL(urlBase)


		val headers_0 = Map(
			"Accept" -> """text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8""",
			"Accept-Encoding" -> """gzip, deflate""",
			"Accept-Language" -> """en-us,en;q=0.5""",
			"Cache-Control" -> """no-cache""",
			"Host" -> """safebrowsing-cache.google.com""",
			"Pragma" -> """no-cache""",
			"User-Agent" -> """Mozilla/5.0 (Macintosh; Intel Mac OS X 10.7; rv:12.0) Gecko/20100101 Firefox/12.0""")


		val headers_1 = Map(
			"Accept" -> """text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8""",
			"Accept-Encoding" -> """gzip, deflate""",
			"Accept-Language" -> """en-us,en;q=0.5""",
			"Host" -> """www.google.fr""",
			"User-Agent" -> """Mozilla/5.0 (Macintosh; Intel Mac OS X 10.7; rv:12.0) Gecko/20100101 Firefox/12.0""")


		val headers_2 = Map(
			"Accept" -> """image/png,image/*;q=0.8,*/*;q=0.5""",
			"Accept-Encoding" -> """gzip, deflate""",
			"Accept-Language" -> """en-us,en;q=0.5""",
			"Host" -> """www.google.fr""",
			"Referer" -> """http://www.google.fr/""",
			"User-Agent" -> """Mozilla/5.0 (Macintosh; Intel Mac OS X 10.7; rv:12.0) Gecko/20100101 Firefox/12.0""")


		val headers_3 = Map(
			"Accept" -> """text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8""",
			"Accept-Encoding" -> """gzip, deflate""",
			"Accept-Language" -> """en-us,en;q=0.5""",
			"Host" -> """www.google.fr""",
			"Referer" -> """http://www.google.fr/""",
			"User-Agent" -> """Mozilla/5.0 (Macintosh; Intel Mac OS X 10.7; rv:12.0) Gecko/20100101 Firefox/12.0""")


		val headers_4 = Map(
			"Accept" -> """image/png,image/*;q=0.8,*/*;q=0.5""",
			"Accept-Encoding" -> """gzip, deflate""",
			"Accept-Language" -> """en-us,en;q=0.5""",
			"Host" -> """id.google.fr""",
			"User-Agent" -> """Mozilla/5.0 (Macintosh; Intel Mac OS X 10.7; rv:12.0) Gecko/20100101 Firefox/12.0""")


		val headers_5 = Map(
			"Accept" -> """text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8""",
			"Accept-Encoding" -> """gzip, deflate""",
			"Accept-Language" -> """en-us,en;q=0.5""",
			"Content-Type" -> """application/ocsp-request""",
			"Host" -> """ocsp.verisign.com""",
			"User-Agent" -> """Mozilla/5.0 (Macintosh; Intel Mac OS X 10.7; rv:12.0) Gecko/20100101 Firefox/12.0""")


		val headers_6 = Map(
			"Accept" -> """text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8""",
			"Accept-Encoding" -> """gzip, deflate""",
			"Accept-Language" -> """en-us,en;q=0.5""",
			"Content-Type" -> """application/ocsp-request""",
			"Host" -> """evsecure-ocsp.verisign.com""",
			"User-Agent" -> """Mozilla/5.0 (Macintosh; Intel Mac OS X 10.7; rv:12.0) Gecko/20100101 Firefox/12.0""")


		val scn = scenario("Scenario name")
					.exec(http("request_218")
					.get("/safebrowsing/rd/ChNnb29nLW1hbHdhcmUtc2hhdmFyEAAY8e0EIMDuBCoGMzcBAP8_Mg3xNgEA______8O-f8D")
					.headers(headers_0)
				)
				.pause(200, MILLISECONDS)
				.exec(http("request_219")
					.get("/safebrowsing/rd/ChFnb29nLXBoaXNoLXNoYXZhchABGNuRBiDkkQYyBtuIAQD_Aw")
					.headers(headers_0)
				)
				.pause(37, MILLISECONDS)
				.exec(http("request_220")
					.get("/safebrowsing/rd/ChFnb29nLXBoaXNoLXNoYXZhchABGOWRBiD4kQYyB-WIAQD__w8")
					.headers(headers_0)
				)
				.pause(59, MILLISECONDS)
				.exec(http("request_221")
					.get("/safebrowsing/rd/ChFnb29nLXBoaXNoLXNoYXZhchABGPmRBiCgkgYqBw6JAQD__wcyB_mIAQD__x8")
					.headers(headers_0)
				)
				.pause(186, MILLISECONDS)
				.exec(http("request_222")
					.get("/safebrowsing/rd/ChFnb29nLXBoaXNoLXNoYXZhchAAGNeEDSDghA0yBldCAwD_Aw")
					.headers(headers_0)
				)
					.exec(http("request_223")
					.get("/safebrowsing/rd/ChFnb29nLXBoaXNoLXNoYXZhchAAGOGEDSCAhg0qC85CAwD_______8HMhJhQgMA_________________x8")
					.headers(headers_0)
				)
				.pause(836, MILLISECONDS)
				.exec(http("request_224")
					.get("http://www.google.fr/")
					.headers(headers_1)
				)
				.pause(919, MILLISECONDS)
				.exec(http("request_225")
					.get("http://www.google.fr/csi")
					.queryParam("v", """3""")
					.queryParam("s", """webhp""")
					.queryParam("action", """""")
					.queryParam("e", """25657,35432,35449,35456,35980,36482,37863,38100,38122,38135,38285,38664,38788,39000,39088,39187""")
					.queryParam("ei", """HBDAT7vJBOTC0QXKyryWDQ""")
					.queryParam("imc", """1""")
					.queryParam("imn", """1""")
					.queryParam("imp", """0""")
					.queryParam("rt", """xjsls.25,prt.32,xjses.140,xjsee.888,xjs.894,ol.897,iml.32,wsrt.583,cst.0,dnst.0,rqst.559,rspt.0""")
					.headers(headers_2)
				)
				.pause(13, SECONDS)
				.exec(http("request_226")
					.get("http://www.google.fr/complete/search")
					.queryParam("client", """hp""")
					.queryParam("hl", """fr""")
					.queryParam("gs_nf", """1""")
					.queryParam("cp", """1""")
					.queryParam("gs_id", """8""")
					.queryParam("xhr", """t""")
					.queryParam("q", """J""")
					.queryParam("tch", """1""")
					.queryParam("ech", """1""")
					.queryParam("psi", """HBDAT7vJBOTC0QXKyryWDQ.1337987100332.1""")
					.headers(headers_3)
				)
				.pause(112, MILLISECONDS)
				.exec(http("request_227")
					.get("http://www.google.fr/complete/search")
					.queryParam("client", """hp""")
					.queryParam("hl", """fr""")
					.queryParam("gs_nf", """1""")
					.queryParam("cp", """2""")
					.queryParam("gs_id", """o""")
					.queryParam("xhr", """t""")
					.queryParam("q", """JC""")
					.queryParam("tch", """1""")
					.queryParam("ech", """2""")
					.queryParam("psi", """HBDAT7vJBOTC0QXKyryWDQ.1337987100332.1""")
					.headers(headers_3)
				)
				.pause(170, MILLISECONDS)
				.exec(http("request_228")
					.get("http://www.google.fr/complete/search")
					.queryParam("client", """hp""")
					.queryParam("hl", """fr""")
					.queryParam("gs_nf", """1""")
					.queryParam("cp", """3""")
					.queryParam("gs_id", """1j""")
					.queryParam("xhr", """t""")
					.queryParam("q", """JCe""")
					.queryParam("tch", """1""")
					.queryParam("ech", """3""")
					.queryParam("psi", """HBDAT7vJBOTC0QXKyryWDQ.1337987100332.1""")
					.headers(headers_3)
				)
				.pause(45, MILLISECONDS)
				.exec(http("request_229")
					.get("http://www.google.fr/complete/search")
					.queryParam("client", """hp""")
					.queryParam("hl", """fr""")
					.queryParam("gs_nf", """1""")
					.queryParam("cp", """4""")
					.queryParam("gs_id", """1z""")
					.queryParam("xhr", """t""")
					.queryParam("q", """JCer""")
					.queryParam("tch", """1""")
					.queryParam("ech", """4""")
					.queryParam("psi", """HBDAT7vJBOTC0QXKyryWDQ.1337987100332.1""")
					.headers(headers_3)
				)
				.pause(90, MILLISECONDS)
				.exec(http("request_230")
					.get("http://www.google.fr/complete/search")
					.queryParam("client", """hp""")
					.queryParam("hl", """fr""")
					.queryParam("gs_nf", """1""")
					.queryParam("cp", """5""")
					.queryParam("gs_id", """2l""")
					.queryParam("xhr", """t""")
					.queryParam("q", """JCert""")
					.queryParam("tch", """1""")
					.queryParam("ech", """5""")
					.queryParam("psi", """HBDAT7vJBOTC0QXKyryWDQ.1337987100332.1""")
					.headers(headers_3)
				)
				.pause(459, MILLISECONDS)
				.exec(http("request_231")
					.get("http://www.google.fr/complete/search")
					.queryParam("client", """hp""")
					.queryParam("hl", """fr""")
					.queryParam("gs_nf", """1""")
					.queryParam("cp", """6""")
					.queryParam("gs_id", """46""")
					.queryParam("xhr", """t""")
					.queryParam("q", """JCerti""")
					.queryParam("tch", """1""")
					.queryParam("ech", """6""")
					.queryParam("psi", """HBDAT7vJBOTC0QXKyryWDQ.1337987100332.1""")
					.headers(headers_3)
				)
				.pause(198, MILLISECONDS)
				.exec(http("request_232")
					.get("http://www.google.fr/complete/search")
					.queryParam("client", """hp""")
					.queryParam("hl", """fr""")
					.queryParam("gs_nf", """1""")
					.queryParam("cp", """8""")
					.queryParam("gs_id", """56""")
					.queryParam("xhr", """t""")
					.queryParam("q", """JCertif """)
					.queryParam("tch", """1""")
					.queryParam("ech", """7""")
					.queryParam("psi", """HBDAT7vJBOTC0QXKyryWDQ.1337987100332.1""")
					.headers(headers_3)
				)
				.pause(450, MILLISECONDS)
				.exec(http("request_233")
					.get("http://www.google.fr/complete/search")
					.queryParam("client", """hp""")
					.queryParam("hl", """fr""")
					.queryParam("gs_nf", """1""")
					.queryParam("cp", """9""")
					.queryParam("gs_id", """6s""")
					.queryParam("xhr", """t""")
					.queryParam("q", """JCertif 2""")
					.queryParam("tch", """1""")
					.queryParam("ech", """8""")
					.queryParam("psi", """HBDAT7vJBOTC0QXKyryWDQ.1337987100332.1""")
					.headers(headers_3)
				)
				.pause(304, MILLISECONDS)
				.exec(http("request_234")
					.get("http://www.google.fr/complete/search")
					.queryParam("client", """hp""")
					.queryParam("hl", """fr""")
					.queryParam("gs_nf", """1""")
					.queryParam("cp", """12""")
					.queryParam("gs_id", """87""")
					.queryParam("xhr", """t""")
					.queryParam("q", """JCertif 2012""")
					.queryParam("tch", """1""")
					.queryParam("ech", """9""")
					.queryParam("psi", """HBDAT7vJBOTC0QXKyryWDQ.1337987100332.1""")
					.headers(headers_3)
				)
				.pause(1, SECONDS)
				.exec(http("request_235")
					.get("http://www.google.fr/search")
					.queryParam("hl", """fr""")
					.queryParam("output", """search""")
					.queryParam("sclient", """psy-ab""")
					.queryParam("q", """JCertif 2012""")
					.queryParam("oq", """JCertif 2012""")
					.queryParam("aq", """f""")
					.queryParam("aqi", """""")
					.queryParam("aql", """""")
					.queryParam("gs_l", """hp.3...13501.16008.1.17545.12.9.0.3.3.0.107.887.5j4.9.0...0.0.bWrixtfenhs""")
					.queryParam("bav", """on.2,or.r_gc.r_pw.r_qf.,cf.osb""")
					.queryParam("fp", """6d7944e76a6466a0""")
					.queryParam("biw", """1280""")
					.queryParam("bih", """687""")
					.queryParam("tch", """1""")
					.queryParam("ech", """1""")
					.queryParam("psi", """HBDAT7vJBOTC0QXKyryWDQ.1337987100332.3""")
					.headers(headers_3)
				)
				.pause(137, MILLISECONDS)
				.exec(http("request_236")
					.get("http://www.google.fr/csi")
					.queryParam("v", """3""")
					.queryParam("s", """web""")
					.queryParam("action", """""")
					.queryParam("ei", """LhDAT5m4K8HKhAehtJ2VCg""")
					.queryParam("e", """25657,35432,35449,35456,35980,36482,37863,38100,38122,38135,38285,38664,38788,39000,39088,39187""")
					.queryParam("cr", """c""")
					.queryParam("imp", """0""")
					.queryParam("pfa", """n.9,ttfc.92,ttlc.0,cbt.39""")
					.queryParam("pfm", """n.9,ttfc.100,ttlc.0,cbt.39""")
					.queryParam("pmd", """max.12,avg.1,0,1,0,5,2,1,0,0,0,0,1,0,0,0,0,0,0,1,12,0""")
					.queryParam("imn", """2""")
					.queryParam("rt", """prt.39,pprt.57,ol.57,jsrt.303,iml.57,kpr.4367,bpl.19330""")
					.headers(headers_2)
				)
				.pause(282, MILLISECONDS)
				.exec(http("request_237")
					.get("http://id.google.fr/verify/EAAAADdhlekkmM72zmR4V1Mfidw.gif")
					.headers(headers_4)
				)
				.pause(61, SECONDS)
				.exec(http("request_238")
					.post("http://ocsp.verisign.com/")
					.headers(headers_5)
					.fileBody("20120526005224_request_238.txt")
				)
				.pause(42, MILLISECONDS)
				.exec(http("request_239")
					.post("http://evsecure-ocsp.verisign.com/")
					.headers(headers_6)
					.fileBody("20120526005224_request_239.txt")
				)


		List(scn.configure.users(1).protocolConfig(httpConf))
	}
}