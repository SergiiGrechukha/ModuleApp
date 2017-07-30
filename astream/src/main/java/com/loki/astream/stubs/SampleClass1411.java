package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1411 {

    @Ignore    private SampleClass1412 sampleClass;

    public SampleClass1411(){
        sampleClass = new SampleClass1412();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}