package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1241 {

    @Ignore    private SampleClass1242 sampleClass;

    public SampleClass1241(){
        sampleClass = new SampleClass1242();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}