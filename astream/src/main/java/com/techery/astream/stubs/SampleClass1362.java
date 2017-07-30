package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1362 {

    @Ignore    private SampleClass1363 sampleClass;

    public SampleClass1362(){
        sampleClass = new SampleClass1363();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}