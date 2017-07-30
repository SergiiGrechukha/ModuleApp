package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1195 {

    @Ignore    private SampleClass1196 sampleClass;

    public SampleClass1195(){
        sampleClass = new SampleClass1196();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}