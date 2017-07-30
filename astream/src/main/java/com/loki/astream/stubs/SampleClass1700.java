package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1700 {

    @Ignore    private SampleClass1701 sampleClass;

    public SampleClass1700(){
        sampleClass = new SampleClass1701();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}