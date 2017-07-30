package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass770 {

    @Ignore    private SampleClass771 sampleClass;

    public SampleClass770(){
        sampleClass = new SampleClass771();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}