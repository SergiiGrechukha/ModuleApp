package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass766 {

    @Ignore    private SampleClass767 sampleClass;

    public SampleClass766(){
        sampleClass = new SampleClass767();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}