package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass151 {

    @Ignore    private SampleClass152 sampleClass;

    public SampleClass151(){
        sampleClass = new SampleClass152();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}