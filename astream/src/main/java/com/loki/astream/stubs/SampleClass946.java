package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass946 {

    @Ignore    private SampleClass947 sampleClass;

    public SampleClass946(){
        sampleClass = new SampleClass947();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}