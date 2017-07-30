package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1211 {

    @Ignore    private SampleClass1212 sampleClass;

    public SampleClass1211(){
        sampleClass = new SampleClass1212();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}