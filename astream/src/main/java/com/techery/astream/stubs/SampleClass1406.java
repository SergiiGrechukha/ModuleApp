package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1406 {

    @Ignore    private SampleClass1407 sampleClass;

    public SampleClass1406(){
        sampleClass = new SampleClass1407();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}