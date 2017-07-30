package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1287 {

    @Ignore    private SampleClass1288 sampleClass;

    public SampleClass1287(){
        sampleClass = new SampleClass1288();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}