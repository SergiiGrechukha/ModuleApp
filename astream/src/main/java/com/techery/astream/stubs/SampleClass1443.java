package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1443 {

    @Ignore    private SampleClass1444 sampleClass;

    public SampleClass1443(){
        sampleClass = new SampleClass1444();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}