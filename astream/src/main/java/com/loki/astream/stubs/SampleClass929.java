package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass929 {

    @Ignore    private SampleClass930 sampleClass;

    public SampleClass929(){
        sampleClass = new SampleClass930();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}