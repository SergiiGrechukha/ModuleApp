package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1223 {

    @Ignore    private SampleClass1224 sampleClass;

    public SampleClass1223(){
        sampleClass = new SampleClass1224();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}