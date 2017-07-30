package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass11 {

    @Ignore    private SampleClass12 sampleClass;

    public SampleClass11(){
        sampleClass = new SampleClass12();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}