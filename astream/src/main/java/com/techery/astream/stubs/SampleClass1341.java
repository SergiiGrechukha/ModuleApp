package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1341 {

    @Ignore    private SampleClass1342 sampleClass;

    public SampleClass1341(){
        sampleClass = new SampleClass1342();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}