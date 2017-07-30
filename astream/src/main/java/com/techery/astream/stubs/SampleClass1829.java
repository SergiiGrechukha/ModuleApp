package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1829 {

    @Ignore    private SampleClass1830 sampleClass;

    public SampleClass1829(){
        sampleClass = new SampleClass1830();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}