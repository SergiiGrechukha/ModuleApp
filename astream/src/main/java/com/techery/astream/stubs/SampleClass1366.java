package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1366 {

    @Ignore    private SampleClass1367 sampleClass;

    public SampleClass1366(){
        sampleClass = new SampleClass1367();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}