package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass97 {

    @Ignore    private SampleClass98 sampleClass;

    public SampleClass97(){
        sampleClass = new SampleClass98();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}