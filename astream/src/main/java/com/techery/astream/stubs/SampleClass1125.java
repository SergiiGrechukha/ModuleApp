package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1125 {

    @Ignore    private SampleClass1126 sampleClass;

    public SampleClass1125(){
        sampleClass = new SampleClass1126();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}