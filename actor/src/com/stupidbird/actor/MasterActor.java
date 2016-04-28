package com.stupidbird.actor;

import com.stupidbird.actor.ActorMessage.Startup;

import akka.actor.UntypedActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;

public class MasterActor extends UntypedActor {
	LoggingAdapter log = Logging.getLogger(getContext().system(), this);

	@Override
	public void onReceive(Object msg) throws Exception {
		if (msg instanceof Startup) {
			startup();
		}
	}

	private void startup() {
		log.info("Startup");
	}

}