package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass388 {

    @Ignore    private SampleClass389 sampleClass;

    public SampleClass388(){
        sampleClass = new SampleClass389();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}