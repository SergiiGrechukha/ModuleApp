package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1862 {

    @Ignore    private SampleClass1863 sampleClass;

    public SampleClass1862(){
        sampleClass = new SampleClass1863();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}