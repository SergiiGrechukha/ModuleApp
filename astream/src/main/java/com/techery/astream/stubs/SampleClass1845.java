package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1845 {

    @Ignore    private SampleClass1846 sampleClass;

    public SampleClass1845(){
        sampleClass = new SampleClass1846();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}