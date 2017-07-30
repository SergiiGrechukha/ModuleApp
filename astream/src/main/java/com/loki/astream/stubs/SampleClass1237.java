package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1237 {

    @Ignore    private SampleClass1238 sampleClass;

    public SampleClass1237(){
        sampleClass = new SampleClass1238();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}