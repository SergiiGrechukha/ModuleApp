package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1332 {

    @Ignore    private SampleClass1333 sampleClass;

    public SampleClass1332(){
        sampleClass = new SampleClass1333();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}