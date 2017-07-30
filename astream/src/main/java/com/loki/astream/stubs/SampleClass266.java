package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass266 {

    @Ignore    private SampleClass267 sampleClass;

    public SampleClass266(){
        sampleClass = new SampleClass267();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}