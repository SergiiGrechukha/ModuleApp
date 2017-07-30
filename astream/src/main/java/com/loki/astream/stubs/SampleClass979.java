package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass979 {

    @Ignore    private SampleClass980 sampleClass;

    public SampleClass979(){
        sampleClass = new SampleClass980();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}