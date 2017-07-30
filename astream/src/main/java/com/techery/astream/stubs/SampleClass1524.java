package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1524 {

    @Ignore    private SampleClass1525 sampleClass;

    public SampleClass1524(){
        sampleClass = new SampleClass1525();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}