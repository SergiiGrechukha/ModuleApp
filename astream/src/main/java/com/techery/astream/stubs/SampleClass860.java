package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass860 {

    @Ignore    private SampleClass861 sampleClass;

    public SampleClass860(){
        sampleClass = new SampleClass861();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}