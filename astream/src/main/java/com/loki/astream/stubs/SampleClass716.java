package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass716 {

    @Ignore    private SampleClass717 sampleClass;

    public SampleClass716(){
        sampleClass = new SampleClass717();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}