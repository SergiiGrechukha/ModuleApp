package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1151 {

    @Ignore    private SampleClass1152 sampleClass;

    public SampleClass1151(){
        sampleClass = new SampleClass1152();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}