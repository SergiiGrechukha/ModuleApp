package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1578 {

    @Ignore    private SampleClass1579 sampleClass;

    public SampleClass1578(){
        sampleClass = new SampleClass1579();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}