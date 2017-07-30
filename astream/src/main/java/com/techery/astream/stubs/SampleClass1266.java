package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1266 {

    @Ignore    private SampleClass1267 sampleClass;

    public SampleClass1266(){
        sampleClass = new SampleClass1267();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}