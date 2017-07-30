package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1215 {

    @Ignore    private SampleClass1216 sampleClass;

    public SampleClass1215(){
        sampleClass = new SampleClass1216();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}