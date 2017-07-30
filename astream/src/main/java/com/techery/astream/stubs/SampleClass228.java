package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass228 {

    @Ignore    private SampleClass229 sampleClass;

    public SampleClass228(){
        sampleClass = new SampleClass229();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}