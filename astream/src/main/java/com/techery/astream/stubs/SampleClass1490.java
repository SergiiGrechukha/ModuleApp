package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1490 {

    @Ignore    private SampleClass1491 sampleClass;

    public SampleClass1490(){
        sampleClass = new SampleClass1491();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}