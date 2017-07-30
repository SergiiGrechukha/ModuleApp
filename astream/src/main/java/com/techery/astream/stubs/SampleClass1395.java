package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1395 {

    @Ignore    private SampleClass1396 sampleClass;

    public SampleClass1395(){
        sampleClass = new SampleClass1396();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}