package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1318 {

    @Ignore    private SampleClass1319 sampleClass;

    public SampleClass1318(){
        sampleClass = new SampleClass1319();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}