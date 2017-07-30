package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1600 {

    @Ignore    private SampleClass1601 sampleClass;

    public SampleClass1600(){
        sampleClass = new SampleClass1601();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}