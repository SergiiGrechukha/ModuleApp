package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1441 {

    @Ignore    private SampleClass1442 sampleClass;

    public SampleClass1441(){
        sampleClass = new SampleClass1442();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}