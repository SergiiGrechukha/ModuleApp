package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1860 {

    @Ignore    private SampleClass1861 sampleClass;

    public SampleClass1860(){
        sampleClass = new SampleClass1861();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}