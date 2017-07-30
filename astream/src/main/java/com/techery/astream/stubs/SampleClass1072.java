package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1072 {

    @Ignore    private SampleClass1073 sampleClass;

    public SampleClass1072(){
        sampleClass = new SampleClass1073();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}