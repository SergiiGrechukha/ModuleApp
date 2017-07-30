package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1979 {

    @Ignore    private SampleClass1980 sampleClass;

    public SampleClass1979(){
        sampleClass = new SampleClass1980();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}